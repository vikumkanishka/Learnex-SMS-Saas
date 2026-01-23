package edu.icet.config;

import org.modelmapper.ModelMapper;

public class Config {
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
