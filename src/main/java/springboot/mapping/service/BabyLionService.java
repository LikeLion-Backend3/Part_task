package springboot.mapping.service;

import springboot.mapping.data.dto.request.ChangeNameRequestDto;
import springboot.mapping.data.dto.request.RequestBabyLionDto;
import springboot.mapping.data.dto.response.ResponseBabyLionDto;

public interface BabyLionService {
    ResponseBabyLionDto getBabyLion(String email) throws Exception;

    ResponseBabyLionDto saveBabyLion(RequestBabyLionDto requestBabyLionDto);

    ResponseBabyLionDto changeBabyLionName(ChangeNameRequestDto changeNameRequestDto) throws Exception;

    void deleteBabyLion(String email) throws Exception;
}