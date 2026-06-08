package chapter09.pratice06;

import java.util.Arrays;
import java.util.Objects;

public class Recipe {
	private String recipeName;
	private String[] ingredients;
	private int ingredientCount;
	private String[] step;
	private int stepCount;

	Recipe() {
		this(null);
	}

	Recipe(String recipeName) {
		this.recipeName = recipeName;
		ingredients = new String[5];
		ingredientCount = 0;
		step = new String[5];
		stepCount = 0;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String[] getIngredients() {
		return ingredients;
	}

	public String[] getStep() {
		return step;
	}

	public int getIngredientCount() {
		return ingredientCount;
	}

	public int getStepCount() {
		return stepCount;
	}

	// 요리 재료 입력
	public void addIngrediendt(String ingredientName) {
		// 재료는 5개 이상이면 리턴 이하면 배열에 저장
		if (ingredientCount >= 5) {
			System.out.println("더이상 재료공간이 부족합니다.");
			return;
		}
		ingredients[ingredientCount++] = ingredientName;
	}
	// 요리 진행 단계
	public void addStep(String stepDescription) {
		// 재료는 5개 이상이면 리턴 이하면 배열에 저장
		if (stepCount >= 5) {
			System.out.println("더이상 요리진행 단계공간이 부족합니다.");
			return;
		}
		step[stepCount++] = stepDescription;
	}

	//String recipeName,int ingredientCount,int stepCount
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Recipe)) {
			System.out.println("비교 대상이 아닙니다.");
			return false;
		} 
		
		// downCasting
		Recipe recipe = (Recipe)obj;
		if (this.recipeName.equals(recipe.recipeName) && this.ingredientCount == recipe.ingredientCount)  {
			return true;
		}
		
		return false;
	}
	
	//hashCode
	@Override
	public int hashCode() {
		// 코드값 주기
		return Objects.hash(recipeName, ingredientCount);
	}
	
	
	//출력
	@Override
	public String toString() {
		return "Recipe [recipeName=" + recipeName + ", \ningredients=" + Arrays.toString(ingredients)
				+ ", ingredientCount=" + ingredientCount + ", \nstep=" + Arrays.toString(step) + ", stepCount="
				+ stepCount + "]";
	}
	
	
}
