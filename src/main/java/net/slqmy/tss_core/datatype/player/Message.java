package net.slqmy.tss_core.datatype.player;

public enum Message {
  // -- The Slimy Swamp Messages

  // - General
  THE_SLIMY_SWAMP,
  NONEXISTENT_PLAYER,
  RANK_REQUIRED,

  // - TSS-Core
  UNABLE_TO_LOAD_DATA,

  // - TSS-SlimeLabs
  ACTIVE_LAUNCH_ANALYSIS_TASK,
  LAUNCH,
  VIEW_LAUNCH_STATISTICS,
  STOP_LAUNCH_ANALYSIS,
  ENTITY,
  TIME,
  ON_GROUND,

  NO_ANALYSIS_TASK,
  LAUNCH_STATISTICS,

  CHUNK_PERSISTENT_DATA_CONTAINER,

  // - TSS-Lobby
  WELCOME_SUBTITLE,
  WELCOME_CHAT_MESSAGE,

  // Cosmetics
  COSMETICS,

  COSMETICS_ITEM_DISPLAY_NAME,
  COSMETICS_ITEM_DESCRIPTION,

  HATS,

  HATS_ITEM_DISPLAY_NAME,
  HATS_ITEM_DESCRIPTION,

  TRAILS,

  TRAILS_ITEM_DISPLAY_NAME,
  TRAILS_ITEM_DESCRIPTION,

  LOCKED,
  COSMETIC_IS_LOCKED,

  CLICK_TO_EQUIP,
  CLICK_TO_UNEQUIP,

  EQUIPPED_COSMETIC,
  UNEQUIPPED_COSMETIC,

  TOP_HAT_DISPLAY_NAME,
  TOP_HAT_DESCRIPTION,

  TIGER_HAT_DISPLAY_NAME,
  TIGER_HAT_DESCRIPTION,

  DOG_HAT_DISPLAY_NAME,
  DOG_HAT_DESCRIPTION,

  HEART_TRAIL_DISPLAY_NAME,
  HEART_TRAIL_DESCRIPTION,

  FIRE_TRAIL_DISPLAY_NAME,
  FIRE_TRAIL_DESCRIPTION,

  WATER_TRAIL_DISPLAY_NAME,
  WATER_TRAIL_DESCRIPTION,

  BUBBLE_TRAIL_DISPLAY_NAME,
  BUBBLE_TRAIL_DESCRIPTION,

  EXPLOSIVE_TRAIL_DISPLAY_NAME,
  EXPLOSIVE_TRAIL_DESCRIPTION,

  SLIME_TRAIL_DISPLAY_NAME,
  SLIME_TRAIL_DESCRIPTION,

  // - TSS-Ranks
  NONEXISTENT_RANK,
  RANK_ALREADY_SET,
  RANK_ALREADY_SET_OTHER,
  RANK_SUCCESSFULLY_SET,
  RANK_SUCCESSFULLY_SET_OTHER,
  RANK_SET_NOTIFICATION,

  // - TSS-Survival
  CHUNK_ALREADY_CLAIMED,
  CHUNK_CLAIMED_SUCCESSFULLY,
  CANT_CLAIM_HERE,

  CHUNK_NOT_CLAIMED,
  NOT_YOUR_CHUNK,
  CLAIMED_TOO_RECENTLY,
  UNCLAIMED_CHUNK,

  CANT_TRUST_YOURSELF,
  PLAYER_ALREADY_TRUSTED,
  PLAYER_SUCCESSFULLY_TRUSTED,

  CANT_UNTRUST_YOURSELF,
  PLAYER_SUCCESSFULLY_UNTRUSTED,

  CANT_INTERACT_BECAUSE_CHUNK_CLAIMED,
  WILDERNESS,
  PLAYER_CLAIM,

  SKILL_LEVEL_UP;

  private final String key;

  Message() {
	key = name().toLowerCase().replace('_', '-');
  }

  public String getKey() {
	return key;
  }
}
