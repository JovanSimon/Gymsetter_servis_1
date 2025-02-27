package com.raf.sk_user_service.mapper;

import com.raf.sk_user_service.domain.Client;
import com.raf.sk_user_service.dto.ClientCreateDto;
import com.raf.sk_user_service.dto.ClientDto;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper{
    public ClientDto clientToClientDto(Client client){
        ClientDto clientDto = new ClientDto();
        clientDto.setNumOfTermins(client.getNumOfTermins());
        clientDto.setId(client.getId());
        clientDto.setName(client.getName());
        clientDto.setEmail(client.getEmail());
        clientDto.setIsZabrana(client.getIsZabrana());
        clientDto.setRole(client.getRole());
        clientDto.setUsername(client.getUsername());
        clientDto.setLastName(client.getLastName());
        clientDto.setDateOfBirth(client.getDateOfBirth());
        return clientDto;
    }

    public Client clientDtoToClient(ClientCreateDto clientCreateDto){
        Client client = new Client();
        client.setEmail(clientCreateDto.getEmail());
        client.setPassword(clientCreateDto.getPassword());
        client.setUsername(clientCreateDto.getUsername());
        client.setRole(clientCreateDto.getRole());
        client.setIsZabrana(Long.valueOf(1));
        client.setNumOfTermins(0);
        return client;
    }
}
