
package sri.materialui;


import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  rename,
  OptDefault,
  OptionalParam
}
import sri.universal._
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.annotation.ScalaJSDefined
import sri.web.vdom.DOMProps
import org.scalajs.dom
import sri.web.vdom.ReactEventAliases._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("material-ui/Tabs",JSImport.Default)
object MuiTabsComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiTabs {
    
    @inline
    def apply(scrollable : OptionalParam[Boolean] = OptDefault,
id : OptionalParam[String] = OptDefault,
fullWidth : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
index : OptionalParam[Boolean | Double | Int] = OptDefault,
textColor : OptionalParam[String] = OptDefault,
scrollButtons : OptionalParam[MuiTabsScrollButtons] = OptDefault,
onChange : OptionalParam[(ReactEventH,Int) => _] = OptDefault,
centered : OptionalParam[Boolean] = OptDefault,
buttonClassName : OptionalParam[String] = OptDefault,
indicatorClassName : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
width : OptionalParam[String] = OptDefault,
indicatorColor : OptionalParam[String] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTabsComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTabsComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTabsComponent.type](
      MuiTabsComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
 
 object MuiTabsC {
   
   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTabsComponent.type](
      MuiTabsComponent,
      json(),
      children = children.toJSArray)
   }
 
 }
 
          
       
         
 @js.native
 trait MuiTabsScrollButtons extends js.Object
 
 object MuiTabsScrollButtons {
   @inline def AUTO = "auto".asInstanceOf[MuiTabsScrollButtons] 
@inline def ON = "on".asInstanceOf[MuiTabsScrollButtons] 
@inline def OFF = "off".asInstanceOf[MuiTabsScrollButtons] 
 } 
 
       


     

         