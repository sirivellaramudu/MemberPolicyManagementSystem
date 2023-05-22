package com.spring.memberpolicy.dao;

import com.spring.memberpolicy.vo.MemberVO;

public class MemberPolicyDAO {
	
	public MemberVO getPlanDetailsOfMember(String memberId,String planId,String corporateName) {
		
		MemberVO memberVO = new MemberVO();
		
		if(memberVO.getPlanVO().getPlanId() != null){
			
			memberVO.setMemberId(memberId);
			memberVO.setPlanVO(memberVO.getPlanVO());
			memberVO.setCorporateName(corporateName);
			
		} 
		
		return memberVO;
		
	}

}
