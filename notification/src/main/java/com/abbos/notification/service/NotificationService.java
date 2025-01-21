package com.abbos.notification.service;

import com.abbos.notification.document.Notification;
import com.abbos.notification.dto.NotificationCreateDTO;
import com.abbos.notification.dto.NotificationResponseDTO;
import com.abbos.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:54
 **/
@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationResponseDTO save(NotificationCreateDTO dto) {
        Notification notification = new Notification().toBuilder()
                .userId(dto.userId())
                .message(dto.message())
                .build();
        Notification saved = notificationRepository.save(notification);
        return new NotificationResponseDTO(saved.getId(), saved.getMessage(), saved.getUserId());
    }

    public List<NotificationResponseDTO> findAll() {
        return notificationRepository.findAll().stream()
                .map(o -> new NotificationResponseDTO(o.getId(), o.getMessage(), o.getUserId()))
                .toList();
    }
}
