class Solution:
    def countPrefixSuffixPairs(self, words: List[str]) -> int:
        
        ans = 0
        for i in range(len(words)):

            for j in range(i+1 , len(words)):
                if(words[j][:len(words[i])] == words[i] and words[j][len(words[j]) - len(words[i]) :] == words[i]):
                    # print(words[i] + " " + words[j] + " -> " + words[j][:len(words[i])] + " & " + words[j][len(words[j]) - len(words[i]) :])
                    ans += 1

        return ans


                