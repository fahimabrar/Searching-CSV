#Search by disease function

searchByDisease()
{
echo "Enter the disease to search:"
read disease
grep -i $disease NCHS_-_Leading_Causes_of_Death__United_States.csv
}



#Search by year function

searchByYear()
{
printf "Enter the year to search: "
read year
IFS=","
count=0
while read one two 
do
	if [[ "$one" == *"$year"* ]]; then
                
		echo "$one$two"
                
	fi
done < "NCHS_-_Leading_Causes_of_Death__United_States.csv"
}


#Count total death per year function(Search by year)

searchByYearTotal(){
echo "Enter the year to search total death of that year: ";
 read input
	count=0
	
	while read line
	do
		
		resource=$(echo "$line" | sed 's/,\("[^"]*"\)*/|\1/g') 
		year="$(cut -d'|' -f1 <<<"$resource")"
		deaths="$(cut -d'|' -f5 <<<"$resource")"
		
		if [[ "$year" == *"$input"* ]]; then
		
			echo "Counting deaths: $deaths";
			count=$((count+deaths));
			
		fi
			
	done < "NCHS_-_Leading_Causes_of_Death__United_States.csv"
	
	echo "Total deaths of $input: $count"


}
#Choose search option search by dieases or year

echo "Enter 1 to search by disease"
echo "Enter 2 to search by year"
echo "Enter 3 to search total death per year"

read a

if [ $a == 1 ]
then
searchByDisease
elif [ $a == 2 ]
then
searchByYear
elif [ $a == 3 ]
then
searchByYearTotal
else
echo "Enter a valid number(1 or 2 or 3)"
fi







