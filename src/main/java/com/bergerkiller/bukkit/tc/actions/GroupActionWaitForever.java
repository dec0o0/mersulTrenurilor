package com.bergerkiller.bukkit.tc.actions;

public class GroupActionWaitForever extends GroupAction implements WaitAction {

	@Override
	public boolean update() {
		getGroup().stop();
		return false;
	}

	@Override
	public boolean isMovementSuppressed() {
		return true;
	}

	@Override
	public void start() {
		for (MinecartMember<?> member : this.getGroup()) {
			if (member instanceof MinecartMemberFurnace) {
				((MinecartMemberFurnace) member).getEntity().setFuelTicks(CommonMinecartFurnace.COAL_FUEL);
			}
		}
	}
}
