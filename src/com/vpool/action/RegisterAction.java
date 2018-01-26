package com.vpool.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vpool.middle.EncryptText;
import com.vpool.middle.RandomNoGenerator;
import com.vpool.middle.SendEmailOTP;
import com.vpool.model.UserModel;
import com.vpool.util.HBUtil;

public class RegisterAction extends UserModel implements ServletRequestAware {

	HttpServletRequest request;
	HttpSession session;

	@Override
	public String execute() throws Exception {
		System.out.println("In Register1Action");
		try {

			int eotp = RandomNoGenerator.generateNumber();
			System.out.println("Email:" + getEmailID() + "\nEOTP:" + eotp);
			SendEmailOTP.sendEmailOtp(getEmailID(), eotp);
			session.setAttribute("firstName", getFirstName());
			session.setAttribute("middleName", getMiddleName());
			session.setAttribute("lastName", getLastName());
			session.setAttribute("emailID", getEmailID());
			session.setAttribute("mobNo", getMobNo());
			session.setAttribute("eotp", eotp);

			return "success";

		} catch (Exception e) {

			e.printStackTrace();
			return "error";
		}
	}

	public String register2() throws Exception {
		System.out.println("In Register2Action");
		try {
			int receivedEOtp = Integer.parseInt(request.getParameter("eotp"));
			System.out.println("user entered eotp:" + receivedEOtp);
			// int receivedMOtp =
			// Integer.parseInt(request.getParameter("motp"));
			// System.out.println("user entered motp:"+receivedMOtp);
			if (receivedEOtp == Integer.parseInt((session.getAttribute("eotp").toString()))) {
				return "success";
			} else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	public String register3() throws Exception {
		System.out.println("In Register3Action");
		try {
			String firstName = session.getAttribute("firstName").toString();
			String middleName = session.getAttribute("middleName").toString();
			String lastName = session.getAttribute("lastName").toString();
			String emailID = session.getAttribute("emailID").toString();
			String mobNo = session.getAttribute("mobNo").toString();
			Session hbSession = HBUtil.openSession();
			Transaction tx = hbSession.beginTransaction();
			System.out.println("middleName:" + middleName);
			System.out.println("lastName:" + lastName);
			UserModel um = new UserModel();
			um.setFirstName(firstName);
			um.setMiddleName(middleName);
			um.setLastName(lastName);
			um.setEmailID(emailID);
			um.setMobNo(mobNo);
			String encPass = new EncryptText().getMD5(getPass());
			System.out.println("pass:" + getPass());
			System.out.println("Enc pass:" + encPass);
			um.setPass(encPass);
			um.setAltMobNo(getAltMobNo());
			um.setGender(getGender());
			um.setAddress(getAddress());
			System.out.println("user dob:" + request.getParameter("userdob"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date udob = sdf.parse(request.getParameter("userdob"));
			System.out.println("dob:" + udob);
			um.setDob(udob);
			um.setCity(getCity());
			um.setPincode(getPincode());
			um.setState(getState());
			um.setStatus("active");
			um.setPhotoLoc(null);
			System.out.println("System Date:" + new Date());
			um.setRegisteredOn(new Date());
			hbSession.save(um);
			tx.commit();
			HBUtil.closeSF();
			return "success";

		} catch (Exception e) {

			e.printStackTrace();
			HBUtil.closeSF();
			return "error";
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		session = request.getSession();
		System.out.println(session.getId());
	}
}
