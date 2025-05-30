package noidea.trying.entity.custom;
// For anyone reading this code, I'm sorry
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WhirlybirdEntity extends AnimalEntity {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public WhirlybirdEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new FlyGoal(this, 1.0D));
        this.goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 4.0F));
        this.goalSelector.add(2, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(3, new LookAroundGoal(this));
        this.goalSelector.add(4, new SwimGoal(this));
        this.goalSelector.add(6, new FollowMobGoal(this, 1.0D, 1.0F, 32.0F));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
    return MobEntity.createMobAttributes()
            .add(EntityAttributes.MAX_HEALTH, 10)
            .add(EntityAttributes.MOVEMENT_SPEED, .5)
            .add(EntityAttributes.FLYING_SPEED, 1)
            .add(EntityAttributes.SCALE, 1)
            .add(EntityAttributes.ATTACK_DAMAGE, 0)
            .add(EntityAttributes.TEMPT_RANGE, 12)
            .add(EntityAttributes.GRAVITY, 0)
            .add(EntityAttributes.FOLLOW_RANGE, 32);
    }

    private void setupAnimationStates() {
        if (this.idleAnimationTimeout <= 0) {
            this.idleAnimationTimeout = 40;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }
}
