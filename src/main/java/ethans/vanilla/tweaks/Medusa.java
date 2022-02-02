package ethans.vanilla.tweaks;

        import net.minecraft.enchantment.Enchantment;
        import net.minecraft.enchantment.EnchantmentTarget;
        import net.minecraft.entity.Entity;
        import net.minecraft.entity.EquipmentSlot;
        import net.minecraft.entity.LivingEntity;
        import net.minecraft.entity.effect.StatusEffectInstance;
        import net.minecraft.entity.effect.StatusEffects;

public class Medusa extends Enchantment {
    public Medusa() {
        super(Enchantment.Rarity.RARE, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
    @Override
    public int getMinPower(int level) {
        return 3;
    }
    @Override
    public int getMaxLevel() {
        return 3;
    }
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2 * level, 100));
        }

        super.onTargetDamaged(user, target, level);
    }

}