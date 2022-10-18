package com.cts.paymentmicroservice.dto;

import com.razorpay.Order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * POJO class for Order response
 * 
 */
//
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Model class for Order response")
public class OrderResponse {

	@Schema(description = "Amount of order created")
	private Integer amount;
	
	@Schema(description = "Currency used in Order")
	private String currency;
	
	@Schema(description = "Id of order created on the razorpay server")
	private String id;
	
	@Schema(description = "Amount paid by customer")
	private Integer amount_paid;
	
	@Schema(description = "Amount due to be paid")
	private Integer amount_due;
	
	@Schema(description = "Receipt number of the order")
	private String receipt;
	
	@Schema(description = "Current Order status")
	private String status;
	
	@Schema(description = "Number of attempts performed")
	private Integer attempts;
	
	
	public OrderResponse(Order order) {
		this.amount =(Integer) order.get("amount");
		this.currency = order.get("currency").toString();
		this.id = order.get("id").toString();
		this.amount_paid=(Integer) order.get("amount_paid");
		this.amount_due=(Integer) order.get("amount_due");
		this.attempts=(Integer) order.get("attempts");
		this.receipt=order.get("receipt").toString();
		this.status=order.get("status").toString();
		
	}
}
//{
//"amount": 49900,
//"amount_paid": 0,
//"notes": [],
//"created_at": 1657117441,
//"amount_due": 49900,
//"currency": "INR",
//"receipt": "txn_123456",
//"id": "order_Jq714K2sILzOtb",
//"entity": "order",
//"offer_id": null,
//"status": "created",
//"attempts": 0
//}

//https://razorpay.com/docs/api/orders/