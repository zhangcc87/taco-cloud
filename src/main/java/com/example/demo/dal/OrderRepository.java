package com.example.demo.dal;

import com.example.demo.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByDeliveryZip(String deliveryZip);

    //List<Order> findByDeliveryNameAndDeliveryCityAllIgnoresCase(String deliveryName, String deliveryCity);

    List<Order> findByDeliveryCityOrderByDeliveryCity(String deliveryCity);

    @Query("select o.id,o.deliveryName from Order o where o.deliveryCity='Seattle'")
    List<Order> readOrdersDeliveredInSeattle();

    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);


}
