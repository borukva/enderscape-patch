package eu.pb4.enderscapepatch.impl.entity.model;

import eu.pb4.enderscapepatch.impl.entity.model.enderling.EnderlingModel;
import eu.pb4.enderscapepatch.impl.entity.model.rubblemite.RubblemiteModel;
import eu.pb4.enderscapepatch.impl.entity.model.rustle.BabyRustleModel;
import eu.pb4.enderscapepatch.impl.entity.model.rustle.RustleModel;
import eu.pb4.enderscapepatch.impl.entity.model.wraith.WraithModel;
import eu.pb4.factorytools.api.virtualentity.emuvanilla2.PolyModelInstance;

import eu.pb4.factorytools.api.virtualentity.emuvanilla2.model.EntityModel;
import eu.pb4.factorytools.api.virtualentity.emuvanilla2.model.LayerDefinition;
import eu.pb4.factorytools.api.virtualentity.emuvanilla2.model.ModelPart;
import net.bunten.enderscape.Enderscape;
import net.bunten.enderscape.entity.rubblemite.RubblemiteVariant;
import net.bunten.enderscape.registry.EnderscapeEntities;
import net.bunten.enderscape.registry.EnderscapeRubblemiteVariants;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.Util;
import net.minecraft.world.entity.EntityType;
import java.util.*;
import java.util.function.Function;

public interface EntityModels {
    List<PolyModelInstance<?>> ALL = new ArrayList<>();
    PolyModelInstance<DrifterModel> DRIFTER = create(DrifterModel::new, DrifterModel.createDrifterLayer(), Enderscape.id("entity/drifter/drifter"));
    PolyModelInstance<DrifterModel> DRIFTER_WITH_JELLY = withTexture(DRIFTER, Enderscape.id("entity/drifter/drifter_with_jelly"));
    PolyModelInstance<DrifterModel> DRIFTLET = create(DrifterModel::new, DrifterModel.createDriftletLayer(), Enderscape.id("entity/drifter/driftlet"));

    Map<ResourceKey<RubblemiteVariant>, PolyModelInstance<RubblemiteModel>> RUBBLEMITE = Util.make(new HashMap<>(), m -> {
        var instance = create(RubblemiteModel::new, RubblemiteModel.createLayer(), EnderscapeRubblemiteVariants.DEFAULT.location().withPrefix("entity/rubblemite/"));
        m.put(EnderscapeRubblemiteVariants.DEFAULT, instance);
        for (var variant : EnderscapeRubblemiteVariants.RUBBLEMITE_VARIANTS) {
            m.put(variant, withTexture(instance, variant.location().withPrefix("entity/rubblemite/")));
        }
    });
    PolyModelInstance<RustleModel> RUSTLE = create(RustleModel::new, RustleModel.createLayer(), Enderscape.id("entity/rustle/rustle"));
    PolyModelInstance<BabyRustleModel> BABY_RUSTLE = create(BabyRustleModel::new, BabyRustleModel.createLayer(), Enderscape.id("entity/rustle/baby"));

    PolyModelInstance<WraithModel> WRAITH = create(WraithModel::new, WraithModel.createLayer(), Enderscape.id("entity/wraith/wraith"));
    PolyModelInstance<EnderlingModel> ENDERLING = create(EnderlingModel::new, EnderlingModel.createLayer(), Enderscape.id("entity/enderling/enderling"));

    IdentityHashMap<EntityType<?>, PolyModelInstance<?>> BY_TYPE = Util.make(() -> {
        var m = new IdentityHashMap<EntityType<?>, PolyModelInstance<?>>();
        m.put(EnderscapeEntities.DRIFTER, EntityModels.DRIFTER);
        m.put(EnderscapeEntities.RUBBLEMITE, EntityModels.RUBBLEMITE.get(EnderscapeRubblemiteVariants.DEFAULT));
        m.put(EnderscapeEntities.RUSTLE, EntityModels.RUSTLE);
        m.put(EnderscapeEntities.WRAITH, EntityModels.WRAITH);
        m.put(EnderscapeEntities.ENDERLING, EntityModels.ENDERLING);
        return m;
    });

    static <T extends EntityModel<?>> PolyModelInstance<T> create(Function<ModelPart, T> modelCreator, LayerDefinition data, ResourceLocation texture) {
        var instance = PolyModelInstance.create(modelCreator, data, texture);
        ALL.add(instance);
        return instance;
    }

    static <T extends EntityModel<?>> PolyModelInstance<T> withTexture(PolyModelInstance<T> original, ResourceLocation texture) {
        var instance = original.withTexture(texture);
        ALL.add(instance);
        return instance;
    }
}
