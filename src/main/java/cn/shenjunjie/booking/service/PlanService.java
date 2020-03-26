package cn.shenjunjie.booking.service;

import cn.shenjunjie.booking.common.rest.RestBody;
import cn.shenjunjie.booking.dto.request.*;
import cn.shenjunjie.booking.dto.response.GetPlanBooksResponse;
import cn.shenjunjie.booking.dto.response.GetPlanResponse;
import cn.shenjunjie.booking.dto.response.PageBean;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @author Junjie.Shen
 * @version 1.0
 * @date 2020/1/12 17:47
 */
public interface PlanService {

    List<GetPlanResponse> getPlans(GetPlanRequest request);

    RestBody addPlan(AddPlanRequest request);

    RestBody updatePlan(UpdatePlanRequest request);

    PageBean<GetPlanBooksResponse> getPlanBooks(GetPlanBookRequest request);

    RestBody addPlanBook(AddPlanBookRequest request);

    RestBody updatePlanBook(UpdatePlanBookRequest request);

    RestBody deletePlanBook(Long id);

    RestBody submitPlanBook(Long id);
}
