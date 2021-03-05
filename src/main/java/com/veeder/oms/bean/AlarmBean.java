package com.veeder.oms.bean;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@Document(indexName = "alarminformation",type = "_doc", shards = 1, replicas = 0)
public class AlarmBean {
    @Id
    private Long Id;

    @Field(type = FieldType.Integer)
    private String DeviceNumber;

    @Field(type = FieldType.Keyword)
    private String AlarmState;

    @Field(type = FieldType.Text)
    private LocalDateTime ActiveTime;

    @Field(type = FieldType.Text)
    private LocalDateTime ClearTime;

    @Field(type = FieldType.Text)
    private LocalDateTime DeviceCategory;

    @Field(type = FieldType.Keyword)
    private LocalDateTime AlarmLevel;

    @Field(type = FieldType.Text)
    private LocalDateTime CreationTime;

    @Field(type = FieldType.Text)
    private LocalDateTime Description;

    @Field(type = FieldType.Text)
    private LocalDateTime NozzleId;

    @Field(type = FieldType.Text)
    private LocalDateTime AlarmCategory;

    @Field(type = FieldType.Text)
    private LocalDateTime AlarmCategoryName;

    @Field(type = FieldType.Text)
    private LocalDateTime Totalize;

    @Field(type = FieldType.Text)
    private LocalDateTime FunctionModule;

}
