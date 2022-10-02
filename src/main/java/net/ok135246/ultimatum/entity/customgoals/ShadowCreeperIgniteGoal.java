package net.ok135246.ultimatum.entity.customgoals;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.ok135246.ultimatum.entity.custom.ShadowCreeperEntity;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;

public class ShadowCreeperIgniteGoal extends Goal {
    private final ShadowCreeperEntity shadowCreeper;
    @Nullable
    private LivingEntity target;

    public ShadowCreeperIgniteGoal(ShadowCreeperEntity shadowcreeper) {
        this.shadowCreeper = shadowcreeper;
        this.setControls(EnumSet.of(Control.MOVE));
    }

    public boolean canStart() {
        LivingEntity livingEntity = this.shadowCreeper.getTarget();
        return this.shadowCreeper.getFuseSpeed() > 0 || livingEntity != null && this.shadowCreeper.squaredDistanceTo(livingEntity) < 9.0;
    }

    public void start() {
        this.shadowCreeper.getNavigation().stop();
        this.target = this.shadowCreeper.getTarget();
    }

    public void stop() {
        this.target = null;
    }

    public boolean shouldRunEveryTick() {
        return true;
    }

    public void tick() {
        if (this.target == null) {
            this.shadowCreeper.setFuseSpeed(-1);
        } else if (this.shadowCreeper.squaredDistanceTo(this.target) > 49.0) {
            this.shadowCreeper.setFuseSpeed(-1);
        } else if (!this.shadowCreeper.getVisibilityCache().canSee(this.target)) {
            this.shadowCreeper.setFuseSpeed(-1);
        } else {
            this.shadowCreeper.setFuseSpeed(1);
        }
    }
}
