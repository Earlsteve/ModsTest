package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

	//todo: nachlesen warum Konstruktor ben�tigt wird
	//wie "zwinge" ich den dev einen Konstruktor zu erzeugen
	public CustomSword() {
		super(ExampleMod.mySwordMaterial);
		// TODO Auto-generated constructor stub
		this.setRegistryName("my_sword");
		this.setUnlocalizedName("my_sword");
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

}
