package soft.club.taxizmati.service;

import soft.club.taxizmati.dtos.BaseDTO;
import soft.club.taxizmati.models.BaseEntity;

import java.util.List;

public interface BaseService<
        T extends BaseEntity,
        CreateDTO extends BaseDTO,
        UpdateDTO extends BaseDTO,
        ResponseDTO extends BaseDTO> {

    ResponseDTO create(CreateDTO dto);

    ResponseDTO update(Long id, UpdateDTO dto);

    void delete(Long id);

    ResponseDTO findById(Long id);

    List<ResponseDTO> getAll();
}
