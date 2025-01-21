package com.abbos.notification.repository;

import com.abbos.notification.document.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:53
 **/
public interface NotificationRepository extends MongoRepository<Notification, Long> {

    @Query("{ 'userId': ?0 }")
    List<Notification> findNotificationsByUserId(String userId);

    @Query("{ 'message': { $regex: ?0, $options: 'i' } }")
    List<Notification> findNotificationsByMessageContaining(String keyword);
}
