package codingTest.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 2024.04.16
public class 매초마다_개미_뛰어넘기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character[] ant1 = { 'J', 'L', 'A' };
		Character[] ant2 = { 'C', 'R', 'U', 'O' };
		int _time = 3;

		// ant1 순서 바꾸기
		List<Character> tmepAnt1 = Arrays.asList(ant1);
		Collections.reverse(tmepAnt1);
		Character[] reverseArr = tmepAnt1.toArray(ant1);

		// List로 변환
		List<Character> list1 = new ArrayList(Arrays.asList(reverseArr));
		List<Character> list2 = new ArrayList(Arrays.asList(ant2));

		// 처음 결과를 미리 담아둔다.
		List<Character> result = new ArrayList();
		result.addAll(list1);
		result.addAll(list2);

		System.out.println("처음 : " + result.toString());

		// 1. 시간만큼 돌리기
		for (int i = 0; i < _time; i++) {

			// 2. list1을 기준으로 result에서 찾는다.
			for (int j = 0; j < list1.size(); j++) {

				int index = result.indexOf(list1.get(j));

				// 3. list1의 값(index) 바로 다음 값(index+1)이 list2에 있는 놈인지 찾는다.
				if (list2.contains(result.get(index + 1))) {

					// 4. 찾으면 값 위치 바꾸기
					Collections.swap(result, index, index + 1);
				}
			}
			System.out.println(i + "초 : " + result.toString());
		}

		System.out.println("최종 : " + result.toString());
	}

}
