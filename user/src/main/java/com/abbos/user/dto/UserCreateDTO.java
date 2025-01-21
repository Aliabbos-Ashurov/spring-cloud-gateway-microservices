package com.abbos.user.dto;

import jakarta.annotation.Nonnull;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:36
 **/
public record UserCreateDTO(
        @Nonnull String fullName,
        @Nonnull String password,
        @Nonnull String username,
        @Nonnull String email
) {
}
