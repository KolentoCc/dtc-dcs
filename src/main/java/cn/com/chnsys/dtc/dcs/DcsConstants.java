/**
 * 
 */
package cn.com.chnsys.dtc.dcs;

/**
 * <p>DCS相关常量</p>
 *
 * @author lixing
 * @version 1.0
 *
 * 创建时间：上午9:24:13
 */
public interface DcsConstants {
    /**
     * 预备开庭
     */
    int TRIAL_STATUS_PREPARING = 1;

    /**
     * 正在开庭
     */
    int TRIAL_STATUS_DOING = 2;
    
    /**
     * 休庭
     */
    int TRIAL_STATUS_PAUSED = 3;

    /**
     * 闭庭
     */
    int TRIAL_STATUS_ENDED = 4;
    
    /**
     * 其他
     */
    int TRIAL_STATUS_OTHERS = 5;
    
    /**
     * 偏移量
     */
    int OFFSET = 0;
    
    /**
     * 间隔
     */
    int LIMITE = 100;
    
    int test = 1;
    
}

