package com.abbos.notification.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Aliabbos Ashurov
 * @since 21/January/2025  11:50
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@Document(collation = "notifications")
public class Notification {
    @Id
    private Long id;
    private String message;
    private Long userId;
}
