package com.study.relationship.gateway.db.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
@Container(containerName = "relationship", ru = "400")
public class RelationshipEntity {

    @Id
    private String id;

    @PartitionKey
    private String customerId;

}