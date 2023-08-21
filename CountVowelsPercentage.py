class CountVowelsPercentage:
    def __init__(self):
        self.input_data = ""
        self.vowels_count = 0

    def count_vowels(self):
        vowels = set("aeiouAEIOU")
        self.vowels_count = sum(1 for char in self.input_data if char in vowels)

    def calculate_percentage(self):
        total_chars = len(self.input_data)
        if total_chars == 0:
            return 0.0

        return round((self.vowels_count / total_chars) * 100, 2)

    def read_input(self):
        self.input_data = input("Enter a string containing characters and digits: ")

if __name__ == "__main__":
    counter = CountVowelsPercentage()
    counter.read_input()
    counter.count_vowels()
    percentage = counter.calculate_percentage()
    print(f"Number of vowels: {counter.vowels_count}")
    print(f"Percentage of vowels: {percentage}%")
