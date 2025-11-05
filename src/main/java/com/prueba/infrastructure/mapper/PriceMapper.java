package com.prueba.infrastructure.mapper;

import com.prueba.domain.Price;
import com.prueba.infrastructure.entity.PriceEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PriceMapper.class})
public interface PriceMapper {
    @Mappings(
            {

                    @Mapping(source = "brandId", target = "brandId"),
                    @Mapping(source = "startDate", target = "startDate"),
                    @Mapping(source = "priceList", target = "priceList"),
                    @Mapping(source = "productId", target = "productId"),
                    @Mapping(source = "priority", target = "priority"),
                    @Mapping(source = "price", target = "price"),
                    @Mapping(source = "curr", target = "curr"),
                    @Mapping(source = "dateCreated", target = "dateCreated"),
                    @Mapping(source = "dateUpdated", target = "dateUpdated")

            }
    )
    Price toPrice(PriceEntity priceEntity);
    Iterable<Price> toPrices (Iterable<PriceEntity> priceEntities);
    List<Price> toPriceEntities (List<PriceEntity> priceEntities);
    @InheritInverseConfiguration
    PriceEntity toPriceEntity (Price price);

}