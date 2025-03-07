package io.github.lsmcodes.gof.model.client;

import org.modelmapper.ModelMapper;

import io.github.lsmcodes.gof.dto.model.client.ClientDTO;
import io.github.lsmcodes.gof.model.address.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String name;

        @ManyToOne
        private Address address;

        public ClientDTO entityToDTO() {
                return new ModelMapper().map(this, ClientDTO.class);
        }

}