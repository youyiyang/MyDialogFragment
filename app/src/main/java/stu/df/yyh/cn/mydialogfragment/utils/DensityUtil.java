package stu.df.yyh.cn.mydialogfragment.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.WindowManager;
/**
 * 类功能描述：</br>
 * 物理尺寸工具类
 * @author 于亚豪
 *  博客地址： http://blog.csdn.net/androidstarjack
 * 公众号： 终端研发部
 * @version 1.0 </p> 修改时间：</br> 修改备注：</br>
 */
public class DensityUtil {
    /**
     * dp转px
     *
     * @param context
     * @param dpVal
     * @return
*/
    public static int dip2px(Context context, float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, context.getResources().getDisplayMetrics());
    }

    /**
     * sp转px
     *
     * @param context
     * @param spVal
     * @return
     */
    public static int sp2px(Context context, float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, context.getResources().getDisplayMetrics());
    }

    /**
     * px转dp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2dp(Context context, float pxVal) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    /**
     * px转sp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2sp(Context context, float pxVal) {
        return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
    }


    public static float getScreeFloatnWidth(Context context) {
        WindowManager wm = (WindowManager) context .getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        return width;
    }
    public static int getScreenIntWidth(Context context) {
        WindowManager wm = (WindowManager) context .getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        return width;
    }

    public static int getScreenIntHeight(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int height = wm.getDefaultDisplay().getHeight();
        return height;
    }
    public static float getScreenHeight(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int height = wm.getDefaultDisplay().getHeight();
        return height;
    }
}  