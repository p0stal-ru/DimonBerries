package com.example.inventory_service.repositories;

import com.example.inventory_service.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {


//    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode);

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
