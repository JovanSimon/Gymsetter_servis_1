package com.raf.sk_user_service.service;

import com.raf.sk_user_service.dto.*;

import java.util.List;


public interface ClientService {
    List<ClientDto> findAll();
    TokenResponseDto logIn(TokenRequestDto tokenRequestDto);
    ClientDto findById(Long id);
    ClientDto add(ClientCreateDto clientCreateDto);

    ClientDto update(Long id, ClientUpdatedDto clientUpdatedDto);
    Integer incriseNumOfTermins(Long id);
    void deleteById(Long id);
    Integer decrement(Long id);

    ClientDto updatePassword(Long id, ClientUpdatePasswordDto clientUpdatePasswordDto);

    ClientDto setZabrana (zabranaDto zabranaDto);
}
