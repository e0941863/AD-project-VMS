package iss.team5.vms.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import iss.team5.vms.model.Booking;
import iss.team5.vms.model.Room;
import iss.team5.vms.model.Student;
import iss.team5.vms.repositories.BookingRepo;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired BookingRepo br;

	@Override
	public ArrayList<Booking> findAllBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking findBooking(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Booking createBooking(Booking booking) {
		return br.saveAndFlush(booking);
	}

	@Override
	public Booking changeBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Booking findBookingByRoom(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Booking> findAllBookingsByRoom(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking findBookingByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Booking> findAllBookingByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room findRoomByBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findStudentByBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

}
