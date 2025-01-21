package com.abbos.user.dto;

import jakarta.annotation.Nonnull;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  13:02
 **/
public record NotificationResponseDTO(
        @Nonnull String id,
        @Nonnull String message,
        @Nonnull Long userId
) {
}
