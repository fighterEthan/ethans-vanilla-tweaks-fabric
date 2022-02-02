package ethans.vanilla.tweaks;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class Leech extends Enchantment {
    public Leech() {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
    @Override
    public int getMinPower(int level) {
        return 3;
    }
    @Override
    public int getMaxLevel() {
        return 1;
    }
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 2, 1));
        }

        super.onTargetDamaged(user, target, level);
    }

}