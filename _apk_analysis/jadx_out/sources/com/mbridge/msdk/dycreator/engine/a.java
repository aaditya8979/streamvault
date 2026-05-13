package com.mbridge.msdk.dycreator.engine;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.G5;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.utils.SdksMapping;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: MBLayoutInflate.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class[] f37179e = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, Constructor> f37180f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f37181g = "com.mbridge.msdk.dycreator.baseview.MB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f37183b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f37185d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37182a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f37184c = new Object[2];

    public a(Context context) {
        this.f37183b = context;
    }

    private void a(XmlPullParser xmlPullParser, View view) throws XmlPullParserException, IOException {
        int next;
        view.requestFocus();
        int depth = xmlPullParser.getDepth();
        do {
            next = xmlPullParser.next();
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        } while (next != 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x00b7, PHI: r8
      0x007a: PHI (r8v4 android.view.ViewGroup$LayoutParams) = (r8v3 android.view.ViewGroup$LayoutParams), (r8v5 android.view.ViewGroup$LayoutParams) binds: [B:29:0x0078, B:24:0x006f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00b7, blocks: (B:13:0x0044, B:14:0x0048, B:19:0x0055, B:21:0x0061, B:22:0x0065, B:31:0x007d, B:30:0x007a, B:40:0x009b, B:41:0x009c, B:42:0x00b6, B:23:0x006b, B:28:0x0074), top: B:52:0x0044, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.xmlpull.v1.XmlPullParser r6, android.view.View r7, android.util.AttributeSet r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto Lbc
            r0 = 0
            r1 = 0
            java.lang.String r2 = "layout"
            int r0 = r8.getAttributeResourceValue(r1, r2, r0)
            if (r0 != 0) goto L38
            java.lang.String r6 = r8.getAttributeValue(r1, r2)
            if (r6 != 0) goto L1c
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "You must specifiy a layout in the include tag: <include layout=\"@layout/layoutID\" />"
            r6.<init>(r7)
            throw r6
        L1c:
            android.view.InflateException r7 = new android.view.InflateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "You must specifiy a valid layout reference. The layout ID "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r6 = " is not valid."
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L38:
            android.content.Context r1 = r5.a()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.XmlResourceParser r0 = r1.getLayout(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r0)     // Catch: java.lang.Throwable -> Lb7
        L48:
            int r2 = r0.next()     // Catch: java.lang.Throwable -> Lb7
            r3 = 1
            r4 = 2
            if (r2 == r4) goto L53
            if (r2 == r3) goto L53
            goto L48
        L53:
            if (r2 != r4) goto L9c
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = "merge"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto L65
            r5.b(r0, r7, r1)     // Catch: java.lang.Throwable -> Lb7
            goto L83
        L65:
            android.view.View r2 = r5.a(r2, r1)     // Catch: java.lang.Throwable -> Lb7
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch: java.lang.Throwable -> Lb7
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r8)     // Catch: java.lang.Throwable -> L72 java.lang.RuntimeException -> L74
            if (r8 == 0) goto L7d
            goto L7a
        L72:
            r6 = move-exception
            goto L9b
        L74:
            android.view.ViewGroup$LayoutParams r8 = r7.generateLayoutParams(r1)     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto L7d
        L7a:
            r2.setLayoutParams(r8)     // Catch: java.lang.Throwable -> Lb7
        L7d:
            r5.b(r0, r2, r1)     // Catch: java.lang.Throwable -> Lb7
            r7.addView(r2)     // Catch: java.lang.Throwable -> Lb7
        L83:
            r0.close()
            int r7 = r6.getDepth()
        L8a:
            int r8 = r6.next()
            r0 = 3
            if (r8 != r0) goto L97
            int r0 = r6.getDepth()
            if (r0 <= r7) goto L9a
        L97:
            if (r8 == r3) goto L9a
            goto L8a
        L9a:
            return
        L9b:
            throw r6     // Catch: java.lang.Throwable -> Lb7
        L9c:
            android.view.InflateException r6 = new android.view.InflateException     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r7.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = r0.getPositionDescription()     // Catch: java.lang.Throwable -> Lb7
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = ": No start tag found!"
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb7
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb7
            throw r6     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r6 = move-exception
            r0.close()
            throw r6
        Lbc:
            android.view.InflateException r6 = new android.view.InflateException
            java.lang.String r7 = "<include /> can only be used inside of a ViewGroup"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.engine.a.a(org.xmlpull.v1.XmlPullParser, android.view.View, android.util.AttributeSet):void");
    }

    private void b(XmlPullParser xmlPullParser, View view, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("requestFocus".equals(name)) {
                    a(xmlPullParser, view);
                } else if ("include".equals(name)) {
                    if (xmlPullParser.getDepth() == 0) {
                        throw new InflateException("<include /> cannot be the root element");
                    }
                    a(xmlPullParser, view, attributeSet);
                } else {
                    if ("merge".equals(name)) {
                        throw new InflateException("<merge /> must be the root element");
                    }
                    View viewA = a(name, attributeSet);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSet);
                    b(xmlPullParser, viewA, attributeSet);
                    viewGroup.addView(viewA, layoutParamsGenerateLayoutParams);
                }
            }
        }
    }

    public Context a() {
        return this.f37183b;
    }

    public View a(String str, AttributeSet attributeSet) {
        if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
            str = attributeSet.getAttributeValue(null, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS);
        }
        System.out.println("******** Creating view: " + str);
        try {
            View viewB = -1 == str.indexOf(46) ? b(str, attributeSet) : a(str, (String) null, attributeSet);
            System.out.println("Created view is: " + viewB);
            return viewB;
        } catch (InflateException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e11);
            throw inflateException;
        } catch (Exception e12) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e12);
            throw inflateException2;
        }
    }

    public View a(String str, ViewGroup viewGroup) {
        return a(str, viewGroup, viewGroup != null);
    }

    public View a(String str, ViewGroup viewGroup, boolean z10) {
        this.f37185d = System.currentTimeMillis();
        System.out.println("INFLATING from resource: " + str);
        return a(a(str), viewGroup, z10);
    }

    public final View a(String str, String str2, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        String str3;
        HashMap<String, Constructor> map = f37180f;
        Constructor<?> constructor = map.get(str);
        Class<?> clsLoadClass = null;
        if (constructor == null) {
            try {
                ClassLoader classLoader = this.f37183b.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                clsLoadClass = classLoader.loadClass(str3);
                constructor = clsLoadClass.getConstructor(f37179e);
                map.put(str, constructor);
            } catch (ClassNotFoundException e10) {
                throw e10;
            } catch (NoSuchMethodException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Error inflating class ");
                if (str2 != null) {
                    str = str2 + str;
                }
                sb2.append(str);
                InflateException inflateException = new InflateException(sb2.toString());
                inflateException.initCause(e11);
                throw inflateException;
            } catch (Exception e12) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(attributeSet.getPositionDescription());
                sb3.append(": Error inflating class ");
                sb3.append(clsLoadClass == null ? "<unknown>" : clsLoadClass.getName());
                InflateException inflateException2 = new InflateException(sb3.toString());
                inflateException2.initCause(e12);
                throw inflateException2;
            }
        }
        Object[] objArr = this.f37184c;
        objArr[1] = attributeSet;
        return (View) constructor.newInstance(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View] */
    public View a(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z10) {
        int next;
        synchronized (this.f37184c) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f37184c[0] = this.f37183b;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (IOException e10) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e10.getMessage());
                    inflateException.initCause(e10);
                    throw inflateException;
                } catch (XmlPullParserException e11) {
                    InflateException inflateException2 = new InflateException(e11.getMessage());
                    inflateException2.initCause(e11);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            String name = xmlPullParser.getName();
            System.out.println("**************************");
            System.out.println("Creating root view: " + name);
            System.out.println("**************************");
            if (!"merge".equals(name)) {
                View viewA = a(name, attributeSetAsAttributeSet);
                ViewGroup.LayoutParams layoutParamsGenerateLayoutParams = null;
                if (viewGroup != 0) {
                    System.out.println("Creating params from root: " + ((Object) viewGroup));
                    layoutParamsGenerateLayoutParams = viewGroup.generateLayoutParams(attributeSetAsAttributeSet);
                    if (!z10) {
                        viewA.setLayoutParams(layoutParamsGenerateLayoutParams);
                    }
                }
                System.out.println("-----> start inflating children");
                b(xmlPullParser, viewA, attributeSetAsAttributeSet);
                System.out.println("-----> done inflating children");
                if (viewGroup != 0 && z10) {
                    viewGroup.addView(viewA, layoutParamsGenerateLayoutParams);
                }
                if (viewGroup == 0 || !z10) {
                    viewGroup = viewA;
                }
            } else {
                if (viewGroup == 0 || !z10) {
                    throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
                }
                b(xmlPullParser, viewGroup, attributeSetAsAttributeSet);
            }
        }
        return viewGroup;
    }

    public XmlPullParser a(String str) {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(new FileInputStream(str), G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return xmlPullParserNewPullParser;
    }

    public View b(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return (str.equals("MBStarLevelLayoutView") || str.equals("LuckPan")) ? a(str, "", attributeSet) : a(str, f37181g, attributeSet);
    }
}
