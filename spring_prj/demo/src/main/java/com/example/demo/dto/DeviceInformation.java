package com.example.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class DeviceInformation {
  private String id;
  private List<DeviceAttribute> attributes;
}
