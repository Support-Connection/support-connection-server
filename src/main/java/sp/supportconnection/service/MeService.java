package sp.supportconnection.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sp.supportconnection.repository.AssetRepository;
import sp.supportconnection.entity.Asset;

@Service
@RequiredArgsConstructor
public class MeService {
    private final AssetRepository assetRepository;

    public Asset updateMyAsset(Asset assetToUpdate, int newMyAsset, int newAnnualIncome) {
        assetToUpdate.setMyAsset(newMyAsset);
        assetToUpdate.setAnnualIncome(newAnnualIncome);

        Asset newAsset = assetRepository.save(assetToUpdate);
        return newAsset;
    }
}