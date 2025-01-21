package com.abbos.notification.dto;

import jakarta.annotation.Nonnull;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:54
 **/
public record NotificationResponseDTO(
        @Nonnull Long id,
        @Nonnull String message,
        @Nonnull Long userId
) {
}
