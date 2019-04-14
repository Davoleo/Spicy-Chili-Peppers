package com.davoleo.spicymod.item.food;

import net.minecraft.item.ItemFood;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/04/2019 / 18:51
 * Class: ItemSpice
 * Project: Spicy_mod
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class ItemSpice extends ItemFood {

    private String name;

    public ItemSpice(String name)
    {
        super(amount, saturation, false);
    }
}
