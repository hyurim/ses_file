package net.datasa.service;

import java.util.ArrayList;

import net.datasa.vo.Member;

public class BmiService {
	ArrayList<Member> list = new ArrayList<>();
	
	public void insertMember(Member member) {
		list.add(member);
	}

	public Member selectByCode(int code) {
		for(Member m: list) {
			if (m.getMyCode() == code) {
				return m;
			}
		}
		return null;
	}

	
	public ArrayList<Member> selectAll() {
		return list;
	}

	public boolean updateByCode(int code, double newHeight, double newWeight) {
        Member member = selectByCode(code);
        if (member != null) {
            member.setHeight(newHeight);
            member.setWeight(newWeight);
            return true;
        }
        return false;
    }
	
	public boolean deleteByCode(int code) {
		Member member = selectByCode(code);
		list.remove(member);
        return true;
	}
}

