package com.abbos.user.dto;

import jakarta.annotation.Nonnull;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:32
 **/
public record UserResponseDTO(
        @Nonnull Long id,
        @Nonnull String fullName,
        @Nonnull String username,
        @Nonnull String email
) {
}
