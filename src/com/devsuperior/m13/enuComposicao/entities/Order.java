package com.devsuperior.m13.enuComposicao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.devsuperior.m13.enuComposicao.entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus orderStatus;
	
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Order() {
	}
	
	
	
	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public List<OrderItem> getItems() {
		return items;
	}

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0;
		
		for(OrderItem c: items) {
			sum += c.subTotal();
		}
		
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) +"\n");
		sb.append("Order status: " + getOrderStatus()+ "\n");
		sb.append(client);
		sb.append("Order items: \n");
		
		for(OrderItem c: items) {
			sb.append(c.getProduct());
			sb.append(c + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		
		
		return sb.toString();
	}
	
}
