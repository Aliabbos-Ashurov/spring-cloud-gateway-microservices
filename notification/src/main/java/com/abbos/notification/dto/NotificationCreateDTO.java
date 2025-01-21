package com.abbos.notification.dto;

import jakarta.annotation.Nonnull;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:55
 **/
public record NotificationCreateDTO(
        @Nonnull String message,
        @Nonnull Long userId
) {
}
