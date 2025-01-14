package uol.compass.gabrielyoshino.ecommerce.repository.vendaproduto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uol.compass.gabrielyoshino.ecommerce.entity.vendaproduto.VendaProduto;

@Repository
public interface VendaProdutoRepository extends JpaRepository<VendaProduto, Long> {

}
