Display "Device status: Normal" rather than "Modified" for the Galaxy S III
===========================================================================

This hack makes the Status screen in Settings display Normal for the device status rather than modified. As one look at the source will tell you, this is not a complicated mod at all.
It only works on a superficial level, so it will not actually prevent the SysScope service itself from finding out that your phone has been rooted or modified in a way that Samsung does
not approve of. This means that you will still be unable to update over-the-air, as the FOTA client checks with SysScope to find out whether your phone is Modified.

Don't rely on this if you have to send your phone back to Samsung for repair. Furthermore, I do not support the use of this as a means of deceiving Samsung for warranty purposes.
If you try and Samsung return your phone back, you have only yourself to blame.

Thanks to rovo89 and Tungstwenty for their work on the wonderful Xposed framework.
