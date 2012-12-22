package pk.qwerty12.cosmeticsysscopenormalizer;

import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam;
import android.content.res.XResForwarder;

public class CosmeticSysScopeNormalizer implements IXposedHookInitPackageResources {

	private static final String PACKAGE_SETTINGS = "com.android.settings";

	@Override
	public void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable {
		if (resparam.packageName.equals(PACKAGE_SETTINGS)) {
			try {
				final int resID = resparam.res.getIdentifier("sysscope_normal", "string", PACKAGE_SETTINGS);

				resparam.res.setReplacement(PACKAGE_SETTINGS, "string", "sysscope_tampered", new XResForwarder(resparam.res, resID));
			} catch (Throwable t) { XposedBridge.log(t); }
		}
	}

}
