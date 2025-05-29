package com.example.account.dto;

import com.example.account.type.TransactionResultType;
import lombok.*;

import javax.transaction.Transaction;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public class UseBalance {
    /**
     * {
     * "userId": 1,
     * "accountNumber": "1000000000"
     * "amount": 1000
     * }
     */
    @Getter
    @Setter
    @AllArgsConstructor
    public static class Request {
        @NotNull
        @Min(1)
        private Long userId;

        @NotBlank
        @Size(min = 10, max = 10)
        private String accountNumber;

        @NotNull
        @Min(10)
        @Min(1000_000_000)
        private Long amount;
    }

    /**
     * {
     * "accountNumber": "1234567890",
     * "transactionResult": "S",
     * "transactionId":"c2033bb6d82a4250gecf8e27c49b63f6",
     * "amount": 1000,
     * "transactedAt": "2022-06-01T23:26:14.671859"
     * }
     */
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private String accountNumber;
        private TransactionResultType transactionResult;
        private String transactionId;
        private Long amount;
        private LocalDateTime transactedAt;
        private LocalDateTime registeredAt;

    }
}
