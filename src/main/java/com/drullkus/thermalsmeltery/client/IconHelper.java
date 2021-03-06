package com.drullkus.thermalsmeltery.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.drullkus.thermalsmeltery.client.lib.LibResources;

public class IconHelper
{

	private static IIcon emptyTexture;

	public static IIcon forName(IIconRegister ir, String name)
	{
		return ir.registerIcon(LibResources.PREFIX_MOD + name);
	}

	public static IIcon forNameRaw(IIconRegister ir, String name)
	{
		return ir.registerIcon(name);
	}

	public static IIcon emptyTexture(IIconRegister ir)
	{
		return emptyTexture == null ? (emptyTexture = forName(ir, LibResources.EMTPY_TEXTURE)) : emptyTexture;
	}

	public static IIcon forBlock(IIconRegister ir, Block block)
	{
		return forNameRaw(ir, block.getUnlocalizedName().replaceAll("tile.", ""));
	}

	public static IIcon forBlock(IIconRegister ir, Block block, int i)
	{
		return forBlock(ir, block, Integer.toString(i));
	}

	public static IIcon forBlock(IIconRegister ir, Block block, String s)
	{
		return forNameRaw(ir, block.getUnlocalizedName().replaceAll("tile.", "") + s);
	}

	public static IIcon forItem(IIconRegister ir, Item item)
	{
		return forNameRaw(ir, item.getUnlocalizedName().replaceAll("item.", ""));
	}

	public static IIcon forItem(IIconRegister ir, Item item, int i)
	{
		return forItem(ir, item, Integer.toString(i));
	}

	public static IIcon forItem(IIconRegister ir, Item item, String s)
	{
		return forNameRaw(ir, item.getUnlocalizedName().replaceAll("item.", "") + s);
	}

}
