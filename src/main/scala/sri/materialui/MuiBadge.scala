
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
 @JSImport("material-ui/Badge",JSImport.Default)
object MuiBadgeComponent extends JSComponent[js.Object] {
   
 
 }
 
 object MuiBadge {
    
    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
badgeContent : ReactNode,
color : OptionalParam[MuiBadgeColor] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiBadgeComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiBadgeComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiBadgeComponent.type](
      MuiBadgeComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 
       
         
 @js.native
 trait MuiBadgeColor extends js.Object
 
 object MuiBadgeColor {
   @inline def DEFAULT = "default".asInstanceOf[MuiBadgeColor] 
@inline def PRIMARY = "primary".asInstanceOf[MuiBadgeColor] 
@inline def ACCENT = "accent".asInstanceOf[MuiBadgeColor] 
 } 
 
       


     

         