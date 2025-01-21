package com.abbos.user.dto;

import jakarta.annotation.Nonnull;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  13:01
 **/
public record NotificationCreateDTO(
        @Nonnull String message,
        @Nonnull Long userId
) {
}
