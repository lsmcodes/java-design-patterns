package io.github.lsmcodes.gof.dto.model.address;

import org.modelmapper.ModelMapper;

import io.github.lsmcodes.gof.model.address.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {

        private String cep;
        private String logradouro;
        private String complemento;
        private String unidade;
        private String bairro;
        private String localidade;
        private String uf;
        private String ibge;
        private String gia;
        private String ddd;
        private String siafi;

        public Address DTOToEntity() {
                return new ModelMapper().map(this, Address.class);
        }

}